/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td2;

import java.util.ArrayList;

public class Gestionnaire
{
    private ArrayList<Salarie> tousLesSalaries;
    private ArrayList<Salarie> lesSalariesInscrits;
    private ArrayList<Certification> toutesLesCertifications;
    
    public Gestionnaire()
    {
        tousLesSalaries = new ArrayList<Salarie>();
        lesSalariesInscrits = new ArrayList<Salarie>();
        toutesLesCertifications = new ArrayList<Certification>();
    }

    /**
     * @return the lesSalaries
     */
    public ArrayList<Salarie> getLesSalariesInscrits() {
        return lesSalariesInscrits;
    }
    
    public void AjouterSalarie(Salarie unSalarie)
    {
        tousLesSalaries.add(unSalarie);
    }
    public void AjouterSalarieInscrit(Salarie unSalarie)
    {
        lesSalariesInscrits.add(unSalarie);
    }

    /**
     * @return the tousLesSalaries
     */
    public ArrayList<Salarie> getTousLesSalaries() {
        return tousLesSalaries;
    }

    /**
     * @return the toutesLesCertifications
     */
    public ArrayList<Certification> getToutesLesCertifications() {
        return toutesLesCertifications;
    }
}
