package model;

import java.util.ArrayList;
import java.util.Random;

public class SaleDayStart implements SaleDayLink {

    private SaleDayLink nextChain;

    @Override
    public void setNextLink(SaleDayLink nextLink) {
        this.nextChain = nextLink;
    }

    @Override
    public void sales(ArrayList<Company> comp, ArrayList<Investor> invest, int i) {

        if(i == 10){
            nextChain.sales(comp, invest, i);
        }
        Random random = new Random();

        int investorInd = random.nextInt(99);
        int companyInd = random.nextInt(99);




    }
}
