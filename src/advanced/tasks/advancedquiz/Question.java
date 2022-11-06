package advanced.tasks.advancedquiz;

import homework.Manager;

public class Question {

    private String text;
    private String[] answers;
    private String rightAnswer;

    public String getText() {
        return text;
    }

    public String[] getAnswers() {
        return answers;
    }

    public String getRightAnswer() {
        return rightAnswer;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setAnswers(String[] answers) {
        this.answers = answers;
    }

    public void setRightAnswer(String rightAnswer) {
        this.rightAnswer = rightAnswer;
    }

    //create a constructor    // String... eto varrargs potomu 4to u nas kak 4 stro4ki v voprose + otveta tak i 3
    public Question(String text,String... answers){
        this.text = text;
        this.answers=answers;
        this.rightAnswer= answers[0];

        //Mixing answers

        for(int i =  0; i <answers.length;i++){
            int randomIndex =(int ) (Math.random() * answers.length);
            String tmp = answers[i];
            answers[i] = answers[randomIndex];
            answers[randomIndex]= tmp;


        }



    }
        public Question(){

        }

}
