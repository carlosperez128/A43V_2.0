package DecBin;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class DecimalBinario {
    private int num;
    private String Bin;    
    public String DecBin(int num) {     
        String base2="";        
        while(num>0) {
            base2=(num%2)+base2;
            num/=2;  
        }
        this.Bin = base2;
        return base2;    
    }
    public String getBin() {
        return Bin;
    }

    public void setBin(String Bin) {
        this.Bin = Bin;
    }
    public void setNum(int i) {
        this.num = i;
    }
    public int getNum() {
        return this.num;
    }
}
