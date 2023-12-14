class Subject (var subjectName:String, var subjectCredit:String)

 fun SubjectInformation(subject: Subject):String{
     return ("This lesson name : ${subject.subjectName} , This lesson has ${subject.subjectCredit}")
 }
fun main(){
    var firstSubject=Subject("Kotlin","300")

    var subjectInformation = SubjectInformation(firstSubject)

    println(subjectInformation)
}