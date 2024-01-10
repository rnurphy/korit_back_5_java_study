package com.study.ch16;

import lombok.AllArgsConstructor;

@AllArgsConstructor

public class ArrayService {
    private String[] strArray;

    public void add(String str) {
        String[] newArray = new String[strArray.length + 1];
        for(int i = 0; i < strArray.length; i++) {
            newArray[i] = strArray[i];
        }
        strArray = newArray;
        strArray[strArray.length - 1] = str;
    }

    public void remove(int index) {
        if(index > strArray.length - 1) {
            System.out.println("오류");
            return;
        }
        String[] newArray = new String[strArray.length - 1];

        for (int i = 0; i < newArray.length; i++) {
            if (i < index) {
                newArray[i] = strArray[i];
            }else {
                newArray[i] = strArray[i + 1];
            }

        }
        strArray = newArray;
    }

    public int indexOf(String str) {
        if (str == null) {
            return -1;
        }
        for (int i = 0; i < strArray.length; i++) {
            if(strArray[i].equals(str)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        String result = "Array[ ";

        for (int i = 0; i < strArray.length; i++) {
            result += strArray[i];
            if(i < strArray.length - 1) {
                result += ", ";
            }
        }
        result += " ]";

        return result;
    }
}
