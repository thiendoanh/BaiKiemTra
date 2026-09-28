package com.example.baikiemtra

data class Student(
    val studentId: String,
    val fullName: String,
    val className: String,
    val age: Int,
    val score: Double
)

fun Student.getUppercaseName(): String {
    return this.fullName.uppercase()
}

fun Student.getStatus(): String {
    return if (this.score >= 5.0) "Đạt" else "Chưa đạt"
}

fun Student.getAcademicRank(): String {
    return when {
        this.score >= 8.5 -> "Xuất sắc"
        this.score >= 7.0 -> "Giỏi"
        this.score >= 5.5 -> "Khá"
        this.score >= 4.0 -> "Trung bình"
        else -> "Yếu"
    }
}