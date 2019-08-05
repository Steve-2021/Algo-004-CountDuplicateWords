package hbcu.stay.ready.algor;

public class Solution {

    public String countUniqueWords(String input) {


        String countUniqueWords = "that that is is that that is not is not is that it it is wutang";
        String[] words = input.split(" ");
        int wrc = 1;

        for (int i = 0; i < words.length; i++)
        {
            for (int j = i + 1; j < words.length; j++)
            {

                if (words[i].equals(words[j]))
                {
                    wrc = wrc + 1;
                    words[j] = "0";
                }
            }
            if (words[i] != "0")
                System.out.println(words[i] + "( Seen " + wrc );
            wrc = 1;

        }


        return null;
    }
}
