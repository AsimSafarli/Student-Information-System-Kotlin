  class Student (var name:String, var surname:String, var number:String){}
fun InformationStudent(student: Student):String{
   return("Student name : ${student.name} , Student surname : ${student.surname} , Student number : ${student.number}")
}
fun main(){
    var firstStudnet  =Student("Asim","Seferli","123456")

    var studentInformation = InformationStudent(firstStudnet)

    println(studentInformation)
}
