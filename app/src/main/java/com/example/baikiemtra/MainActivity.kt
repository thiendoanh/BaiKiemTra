package com.example.baikiemtra

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val student = Student(
            studentId = "2415053122206",
            fullName = "lam Hung Thien Doanh",
            className = "24T2",
            age = 21,
            score = 8.5,
            major = "Công nghệ thông tin"
        )

        val tvStudentId = findViewById<TextView>(R.id.tvStudentId)
        val tvFullName = findViewById<TextView>(R.id.tvFullName)
        val tvClass = findViewById<TextView>(R.id.tvClass)
        val tvAge = findViewById<TextView>(R.id.tvAge)
        val tvMajor = findViewById<TextView>(R.id.tvMajor)
        val tvFormattedScore = findViewById<TextView>(R.id.tvFormattedScore)
        val tvSummaryInfo = findViewById<TextView>(R.id.tvSummaryInfo)

        tvStudentId.text = "Mã sinh viên: ${student.studentId}"
        tvFullName.text = "Họ và tên: ${student.fullName}"
        tvClass.text = "Lớp: ${student.className}"
        tvAge.text = "Tuổi: ${student.age}"
        tvMajor.text = "Chuyên ngành (Bổ sung): ${student.major}"

        tvFormattedScore.text = "Điểm (Định dạng đặc biệt): ${student.getFormattedScore()}"
        tvSummaryInfo.text = student.getSummaryInfo()
    }
}