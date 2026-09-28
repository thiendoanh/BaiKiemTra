package com.example.baikiemtra

data class Student(
    val studentId: String,
    val fullName: String,
    val className: String,
    val age: Int,
    val score: Double,
    val major: String
)

fun Student.getFormattedScore(): String {
    val gradeLetter = when {
        this.score >= 8.5 -> "A"
        this.score >= 7.0 -> "B"
        this.score >= 5.5 -> "C"
        this.score >= 4.0 -> "D"
        else -> "F"
    }
    return String.format("%.2f / 10.0 (Điểm chữ: %s)", this.score, gradeLetter)
}

fun Student.getSummaryInfo(): String {
    return """
        --- THÔNG TIN CHI TIẾT ---
        Mã SV: ${this.studentId}
        Họ tên: ${this.fullName}
        Lớp: ${this.className}
        Tuổi: ${this.age}
        Chuyên ngành: ${this.major}
        Điểm số: ${this.getFormattedScore()}
    """.trimIndent()
}