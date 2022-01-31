package android.example.quizapp

import java.util.*
import kotlin.collections.ArrayList

object Constants{

    const val USER_NAME:String="user_name"
    const val TOTAL_QUESTIONS:String="total_question"
    const val CORRECT_ANSWERS:String="correct_answers"


    fun getQuestions():ArrayList<Questions> {
        val questionsList = ArrayList<Questions>()

        val q1 = Questions(

        1,
        "Which of the following type of class allows only one object of it to be created?",
        "Virtual class",
        "Abstract class",
        "Singleton class",
        "Friend class",
        3)
        questionsList.add(q1)

        val q2 = Questions(

            2,
            "Which of the following is not a type of constructor?",
                    	"Copy constructor",
                    	"Friend constructor",
                    	"Default constructor",
                    	"Parameterized constructor",
            2
        )


        questionsList.add(q2)

        val q3 = Questions(
            3,
            "Which of the following statements is correct?",

            	"Base class pointer cannot point to derived class.",
        	"Derived class pointer cannot point to base class.",
        	"Pointer to derived class cannot be created.",
        	"Pointer to base class cannot be created",
            2
        )


        questionsList.add(q3)

        val q4 = Questions(

            4,
                    "Which of the following is not the member of class?",

        	"Static function",
               	"Friend function",
                	"Const function",
                	"Virtual function",
            2
        )

        questionsList.add(q4)

        val q5 = Questions(
 5,
            "Which of the following term is used for a function defined inside a class?",

        	"Member Variable",
               	"Member function",
                	"Class function",
                	"Classic function",
            2
        )

        questionsList.add(q5)

        val q6 = Questions(

            6,
            "Which of the following concept of oops allows compiler to insert arguments in a function call if it is not specified?",

                   	"Call by value",
                  	"Call by reference",
                    	"Default arguments",
                    	"Call by pointer",
            3
        )

        questionsList.add(q6)

        val q7= Questions(

            7,
                    "Which of the following cannot be friend?",

        "Function",
        	"Class",
        	"Object",
     	"Operator function",
            3
        )

        questionsList.add(q7)

        val q8 = Questions(

        8,
                "Which of the following concepts of OOPS means exposing only necessary information to client?",

        	"Encapsulation",
        	"Abstraction",
       "Data hiding",
              	"Data binding",
            3
        )

        questionsList.add(q8)

        val q9 = Questions(

            9,
            "Why reference is not same as a pointer?",

                    	"A reference can never be null.",
           	"A reference once established cannot be changed.",
            	"Reference doesn't need an explicit dereferencing mechanism.",
                    	"All of the above.",
            4
        )

        questionsList.add(q9)

        val q10 = Questions(

      10,
      "Which of the following is an abstract data type?",
      "int",
      "double",
      "string",
      "Class",
            4
        )

        questionsList.add(q10)

        val q11 = Questions(

       11,
       "Which of the following concepts means adding new components to a program as it runs?",
       "Data hiding",
       "Dynamic typing",
       "Dynamic binding",
       "Dynamic loading",
            4
        )

        questionsList.add(q11)

        val q12 = Questions(
        12,
        "Which of the following correctly describes overloading of functions?",
        "Virtual polymorphism",
        "Transient polymorphism",
        "Ad-hoc polymorphism",
        "Pseudo polymorphism",
        3
        )

        questionsList.add(q12)

        val q13 = Questions(
        13,
        "Which of the following approach is adapted by C++?",
        "Top-down",
        "Bottom-up",
        "Right-left",
        "Left-right",
        2
        )

        questionsList.add(q13)

        val q14 = Questions(

        14,
        "Which of the following is correct about function overloading?",
        "The types of arguments are different.",
        "The order of argument is different.",
        "The number of argument is same.",
        "Both A and B.",
        4
        )

        questionsList.add(q14)

        val q15 = Questions(

        15,
        "Which of the following concepts means wrapping up of data and functions together?",
        "Abstraction",
        "Encapsulation",
        "Inheritance",
        "polymorphism",
        2
        )

        questionsList.add(q15)
        questionsList.shuffle()
        return questionsList
    }
}