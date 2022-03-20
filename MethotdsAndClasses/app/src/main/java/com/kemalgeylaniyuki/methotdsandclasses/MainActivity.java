 package com.kemalgeylaniyuki.methotdsandclasses;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    String username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("onCreate Called");

        testMethod();

        System.out.println(math(3, 5));

        System.out.println(newMethod("Kemal"));

        makeMusicians();

        makeSimpsons();

    }

    public void makeSimpsons(){

        Simpsons homer = new Simpsons("Homer", 50, "Nuclear");
        //homer.age = 51;
        //System.out.println(homer.age);

        System.out.println(homer.getName());
        homer.setName("Homer Simpson");
        System.out.println(homer.getName());

    }

    public void makeMusicians(){

        // insatance - Object - Nesne

        Musicians james = new Musicians("James","Guitar", 50);
        System.out.println(james.instrument);

        /*
        james.name = "James";
        james.instrument = "Guitar";
        james.age = 50;
        */

    }


    public void testMethod(){
        int x = 4 + 4;
        System.out.println("Value of x : " + x);
        username = "";
    }

    public int math(int a, int b){

        return a + b;
    }

    public String newMethod(String string){

        return string + "YUKİ";
    }



    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("onResume Called");
        username = "Kemal1";
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("onStop Called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("onPause Called");
    }


}