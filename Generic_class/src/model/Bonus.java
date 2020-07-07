/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Praktikan
 */
public class Bonus<b>
{
    private b data;
    public Bonus (b data)
    {
        this.data=data;
    }

    /**
     * @return the data
     */
    public b getData()
    {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(b data)
    {
        this.data = data;
    }
}
