package com.asb.option

object OptionMain {

  case class Employee(id: Long, name: String, age: Long, team: String)

  case class Address(id: Long, empID: Long, line1: String, line2: String, city: String, state: String, pin: String)

  def getEmployeeIdByEmployeeName(name: String): Option[Long] = name match {
    case "Arjun" => Some(1L)
    case "Aditya" => Some(2L)
    case _ => None
  }

  def getEmployeeById(id: Long): Option[Employee] = id match {
    case 1L => Some(Employee(1L, "Arjun", 28, "SSR"))
    case 2L => Some(Employee(2L, "Aditya", 23, "SE"))
    case _ => None
  }

  def getAddressByEmpId(empId: Long): Option[Address] = empId match {
    case 1L => Some(Address(1L, 1L, "KGS Lyt", "Vijayanagar", "BLR", "KAR", "560040"))
    case 2L => Some(Address(2L, 2L, "Bagmane", "Mahadevpura", "BLR", "KAR", "560079"))
    case _ => None
  }

  def main(args: Array[String]): Unit = {
    val pin = getEmployeeIdByEmployeeName("Arjun")
      .flatMap(id => getEmployeeById(id)
        .flatMap(emp => getAddressByEmpId(emp.id)))
      .map(address => address.pin)
    println(pin)
  }
}
