package com.example.numbertowordconverter_sujan;

class NumberToWordsConverter_Sujan {
    private int num;
    private String convert;

    private String[] number = {"", "One", "Two", "Three", "Four", "Five", "Six",
            "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen",
            "Fourteen", "Fiveteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};

   private String[] tensnumber = {"", "", "Twenty", "Thirty", "Fourty", "Fifty", "Sixty",
           "Seventy", "Eighty", "Ninety"};

    public NumberToWordsConverter_Sujan(int num)
    {
        this.num=num;
    }

    public String Conversion() {
        if (num < 20) {
            convert = number[num];

        } else if (num / 10 < 10) {
            int a, b;

            a = num / 10;
            b = num % 10;

            convert = tensnumber[a] + " " + number[b] + " Only";
        } else if (num >= 100) {
            int a, b, c,d;
            d=num;
            a = num / 100;
            num = num % 100;
            b = num / 10;
            c = num % 10;

            convert = number[a]+" "+ "Hundreds"+ " " + tensnumber[b] +" "+ number[c] + " Only";
        }
        return convert;
    }
}