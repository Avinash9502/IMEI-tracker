/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imei.track;

/**
 *
 * @author Daniel
 */
public class Phones {
    
    private String imei;
    private String name;
    private String history;
    
    public String getImei()
    {
        return imei;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getHistory()
    {
        return history;
    }
    
    public void setImei(String i)
    {
        imei = i;
    }
    
    public void setName(String n)
    {
        name = n;
    }
    
    public void setHistory(String h)
    {
        history = h;
    }
            
}
