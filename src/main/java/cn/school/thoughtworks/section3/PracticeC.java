package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        PracticeD practiceD = new PracticeD();
        HashMap<String, Integer> hashMap = practiceD.countNumbers(collectionA);
        return practiceD.compareToCollectionAndDiscount(object, hashMap);
    }
}
