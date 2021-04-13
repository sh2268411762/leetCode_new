package sjjg_OJ;


import java.util.*;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 692. 前K个高频单词
 * @Date 2021/4/13 上午 8:38
 */


public class Test34
{
    class WordNumber implements Comparable<WordNumber>
    {
        public int count;
        public String word;

        public WordNumber(int count, String word)
        {
            this.count = count;
            this.word = word;
        }

        @Override
        public int compareTo(WordNumber o)
        {
            if (count > o.count)
            {
                return -1;
            } else if (count < o.count)
            {
                return 1;
            } else
            {
                return word.compareTo(o.word);
            }

        }
    }

    public List<String> topKFrequent(String[] words, int k)
    {
        Map<String, Integer> map = countTheNumberOfTimesEachWordAppears(words);

        WordNumber[] array = new WordNumber[map.size()];    //创建数组
        int i = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet())
        {
            String word = entry.getKey();
            int count = entry.getValue();

            WordNumber wn = new WordNumber(count, word);
            array[i++] = wn;
        }

        Arrays.sort(array);
        List<String> list = new ArrayList<>();
        for (int j = 0; j < k; j++)
        {
            list.add(array[j].word);
        }
        return list;
    }

    private Map<String, Integer> countTheNumberOfTimesEachWordAppears(String[] words)
    {
        Map<String, Integer> map = new TreeMap<>();
        for (String str : words)
        {
            int count = map.getOrDefault(str, 0);
            map.put(str, count + 1);
        }
        return map;
    }
}
