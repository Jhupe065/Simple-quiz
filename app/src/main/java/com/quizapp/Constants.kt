package com.quizapp

import com.quizapp.R
import com.quizapp.Question

object Constants {

    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    
    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1, "Phần của đường bộ được sử dụng cho các phương tiện giao thông qua lại là gì?",
            "1- Phần mặt đường và lề đường.",
            "2- Phần đường xe chạy.",
            "3- Phần đường xe cơ giới.",
            "4- Phần mặt đường",
            2
        )
        questionsList.add(que1)

        val que2 = Question(
            2, "Bạn đang lái xe trong khu vực đô thị từ 22 giờ đến 5 giờ sáng hôm sau và cần vượt một xe khác, bạn cần báo hiệu như thế nào để đảm bảo an toàn giao thông?",
            "1- Phải báo hiệu bằng đèn hoặc còi;",
            "2- Chỉ được báo hiệu bằng còi.",
            "3- Phải báo hiệu bằng cả còi và đèn.",
            "4- Chỉ được báo hiệu bằng đèn.",
            4
        )
        questionsList.add(que2)

        val que3 = Question(
            3, "Trên đoạn đường hai chiều không có giải phân cách giữa, người lái xe không được vượt xe khác trong các trường hợp nào dưới đây?",
            "1- Xe bị vượt bất ngờ tăng tốc độ và cố tình không nhường đường.",
            "2- Xe bị vượt giảm tốc độ và nhường đường.",
            "3- Phát hiện có xe đi ngược chiều.",
            "4- Cả ý 1 và ý 3.",
            4
        )
        questionsList.add(que3)

        val que4 = Question(
            4, "Để báo hiệu cho xe phía trước biết xe mô tô của bạn muốn vượt, bạn phải có tín hiệu như thế nào dưới đây?",
            "1- Ra tín hiệu bằng tay rồi cho xe vượt qua.",
            "2- Tăng ga mạnh để gây sự chú ý rồi cho xe vượt qua.",
            "3- Bạn phải có tín hiệu bằng đèn hoặc còi.",
            "4- Cả ý 1 và ý 3.",
            3
        )
        questionsList.add(que4)

        val que5 = Question(
            5, "Tay ga trên xe mô tô hai bánh có tác dụng gì trong các trường hợp dưới đây?",
            "1- Để điều khiển xe chạy về phía trước.",
            "2- Để điều tiết công suất động cơ qua đó điều khiển tốc độ của xe.",
            "3- Để điều khiển xe chạy lùi.",
            "4- Cả ý 1 và ý 2.",
            4
        )
        questionsList.add(que5)


        return questionsList
    }
}