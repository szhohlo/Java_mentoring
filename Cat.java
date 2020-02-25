package com.epam.mentoring;

public class Cat {

    private String catVoice;

    private void setCatVoice(String word) {
        catVoice = word;
    }

    public void printVoice(String newWord) {
        catVoice = newWord;
        System.out.println(catVoice);
    }


}
