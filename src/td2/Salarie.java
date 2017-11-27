/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package td2;

import java.util.ArrayList;

public class Salarie
{
    private String nom;
    private String prenom;
    private ArrayList<Certification> sesCertifications;
    
    public Salarie()
    {
        sesCertifications = new ArrayList<Certification>();
    }
    public Salarie(String unNom,String unPrenom)
    {
        nom = unNom;
        prenom = unPrenom;
        sesCertifications = new ArrayList<Certification>();
    }

    /**
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @return the saCertif
     */
    public ArrayList<Certification> getSesCertifications() {
        return sesCertifications;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }
}
