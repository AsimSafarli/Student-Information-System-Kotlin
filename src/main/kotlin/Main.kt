import InformationStudent.Student
import Subject.Subject

class  StudenInformationSystem{
    val studens = arrayListOf<Student>()

    var subjects = arrayListOf<Subject>()

    fun studentAdd(student: Student){
        studens.add(student)
    }

    fun subjectAdd(subject: Subject){
        subjects.add(subject)
    }

    fun studenInformationShow(){
        println("Student Information")
        for (student in studens){
            println("${student.name},${student.surname},${student.number}")
        }
    }

    fun subjectInformationShow(){
        println("Subject Information")
        for (subject in subjects){
            println("${subject.subjectName},${subject.subjectCredit}")
        }
    }


}

fun main(){
   val student1 = Student("Asim","Safarli",300)
    val student2 = Student("Nicat","Mustafayev",301)

    val subject1 = Subject("Kotlin",10)
    var subject2 = Subject("Swift",15)

    val studentInformationSystem = StudenInformationSystem()

    //student add func
    studentInformationSystem.studentAdd(student1)
    studentInformationSystem.studentAdd(student2)

    //subject add func
    studentInformationSystem.subjectAdd(subject1)
    studentInformationSystem.subjectAdd(subject2)

    studentInformationSystem.studenInformationShow()
    studentInformationSystem.subjectInformationShow()



}