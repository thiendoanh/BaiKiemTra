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
            fullName = "Lam Hung Thien Doanh",
            className = "24T2",
            age = 21,
            score = 8.5
        )

        val tvStudentId = findViewById<TextView>(R.id.tvStudentId)
        val tvFullName = findViewById<TextView>(R.id.tvFullName)
        val tvClass = findViewById<TextView>(R.id.tvClass)
        val tvAge = findViewById<TextView>(R.id.tvAge)
        val tvScore = findViewById<TextView>(R.id.tvScore)
        val tvStatus = findViewById<TextView>(R.id.tvStatus)
        val tvRank = findViewById<TextView>(R.id.tvRank)

        tvStudentId.text = "Mã sinh viên: ${student.studentId}"
        tvFullName.text = "Họ và tên: ${student.getUppercaseName()}"
        tvClass.text = "Lớp: ${student.className}"
        tvAge.text = "Tuổi: ${student.age}"
        tvScore.text = "Điểm: ${student.score}"

        tvStatus.text = "Trạng thái: ${student.getStatus()}"
        tvRank.text = "Xếp loại: ${student.getAcademicRank()}"
    }
}