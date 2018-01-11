package strings.tagContentExtractor;
//https://www.hackerrank.com/challenges/tag-content-extractor/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*4

$str = "Hello, this <b>word</b> is <b>bold</b>!";
$re = '|<(\w+) [^>]* > (.*) </\1>|xs';

        <h1>Nayeem loves counseling</h1>
        <h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>
        <Amee>safat codes like a ninja</amee>
        <SA premium>Imtiaz has a secret crush</SA premium>

        10
<h1>some</h1>
<h1>had<h1>public</h1></h1>
<h1>had<h1>public</h1515></h1>
<h1><h1></h1></h1>
<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>
<>hello</>
<>hello</><h>dim</h>
<>hello</><h>dim</h>>>>>


        */


public class Solution{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        List<String> list = new ArrayList<>();
        String regex = "<(.+)>[^<]+</\\1>";
        Pattern pattern = Pattern.compile(regex);
        while(testCases>0){
            String line = in.nextLine();
            Matcher matcher = pattern.matcher(line);
            if (!matcher.find()) list.add("None");
            matcher.reset();
            while(matcher.find()){
                String temp = matcher.group();
                temp = temp.replaceAll("<(.+?)>","");
                list.add(temp);
            }
            testCases--;
        }
        for (String now:list){
            System.out.println(now);
        }


    }
}