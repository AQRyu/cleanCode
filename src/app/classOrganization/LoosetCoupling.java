package app.classOrganization;

import java.util.ArrayList;
import java.util.List;

/**
 * Looset coupling
 * Bang cach su dung interface de  giam thieu toi da thong tin phai sua
 * Mac du vay thi interface List khong co 2 function getFirst + getLast
 * nen ta chi giam duoc:
 * - field 1
 * - cac parameters p1, p2
 */
public class LoosetCoupling {
    List<String> LoosetCoupling = new ArrayList<>();// f1

    public String getFirst(List<String> list){// p1
        return list.get(0);
    }

    public String getLast(List<String> list){// p2
        return list.get(list.size() - 1);
    }
    
}