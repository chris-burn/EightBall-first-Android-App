package com.example.user.eightball;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by user on 29/06/2017.
 */

public class Answers implements Answerable {
//    should be singular

    private ArrayList<String> answers;

    public Answers(){
        answers = new ArrayList<String>();
        setupAnswers();
    }

    public Answers(ArrayList<String> newAnswers) {
        answers = newAnswers;
    }

    private void setupAnswers() {

        String[] answersToAdd = {
                "Yes!",
                "That would be an ecumenical matter!"};
        for (String answer : answersToAdd) {
            answers.add(answer);
        }
    }

//        answers.add("Arse Biscuits");
//        answers.add("Girls");

//        for(int i=0; i<2; i++){
//            answers.add(String.format("Sample value %d", i));


    public ArrayList<String> getAnswers() {
//        return answers;
        return new ArrayList<String>(answers);
    }

//    "return answers" not considered best practice as we have made Private ArrayList fully public!
//    rather hand back a copy of ArrayList

    public int getLength(){
        return answers.size();
    }


    public void add(String newAnswer) {
        answers.add(newAnswer);
    }

    public String getAnswersAtIndex(int index) {
        return answers.get(index);
    }

    public String getAnswer() {
        Random rand = new Random();
        int listSize = getLength();

        int index = rand.nextInt(listSize);
        return getAnswersAtIndex(index);
    }
}
