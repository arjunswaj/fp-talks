package com.asb.option

object OptionMain {

  case class Employee(id: Long, name: String, age: Long, team: String, level: Long)

  case class Address(id: Long, empID: Long, line1: String, line2: String, city: String, state: String, pin: String)

  def getEmployeeIdByEmployeeName(name: String): Option[Long] = name match {
    case "Arjun" => Some(1L)
    case "Aditya" => Some(2L)
    case _ => None
  }

  def getEmployeeById(id: Long): Option[Employee] = id match {
    case 1L => Some(Employee(1L, "Arjun", 28, "SSR", 5))
    case 2L => Some(Employee(2L, "Aditya", 23, "SE", 4))
    case _ => None
  }

  def getAddressByEmpId(empId: Long): Option[Address] = empId match {
    case 1L => Some(Address(1L, 1L, "KGS Lyt", "Vijayanagar", "BLR", "KAR", "560040"))
    case 2L => Some(Address(2L, 2L, "Bagmane", "Mahadevpura", "BLR", "KAR", "560079"))
    case _ => None
  }

  def main(args: Array[String]): Unit = {
    val pin = getEmployeeIdByEmployeeName("Aditya")
      .flatMap(id => getEmployeeById(id)
        .filter(emp => emp.level < 5)
        .flatMap(emp => getAddressByEmpId(emp.id)))
      .map(address => address.pin)

    println(pin)

    val pin2 = for {
      id <- getEmployeeIdByEmployeeName("Arjun")
      emp <- getEmployeeById(id) if emp.level < 5
      address <- getAddressByEmpId(emp.id)
    } yield address.pin

    println(pin2)
  }
}
