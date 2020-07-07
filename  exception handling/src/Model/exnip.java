/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Praktikan
 */
public class exnip extends Exception
{

    public exnip()
    {
    }
    public void msgnip()
    {
        System.out.println("inputan tidak valid, nip harus 7 digit");
    }
}
