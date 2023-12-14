package InformationStudent

class Student (var name:String, var surname:String, var number:String){}
fun InformationStudent(student: Student):String{
   return("InformationStudent.Student name : ${student.name} , InformationStudent.Student surname : ${student.surname} , InformationStudent.Student number : ${student.number}")
}
fun main(){
    var firstStudnet  = Student("Asim","Seferli","123456")

    var studentInformation = InformationStudent(firstStudnet)

    println(studentInformation)
}
