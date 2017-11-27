/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package td2;

import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */

public class Certification
{
        // Membres privés
        private String nomCertif;
        private int niveauDeDifficulte;
        private ArrayList<Competence> lesCompetences;
        
        public Certification()
        {
            
        }
        
        public Certification(String unNom, int unNiveau)
        {
            nomCertif = unNom;
            niveauDeDifficulte = unNiveau;
            lesCompetences = new ArrayList<Competence>();
        }
        // Permet de récupérer le nom de la certification
        public String getNomCertif()
        {
            return nomCertif;
        }
        // Permet de récupérer le niveau de la certification
        public int getNiveau()
        {
            return niveauDeDifficulte;
        }
        // Permet de récupérer la compétence à l'indice i
        public Competence getLaCompetence(int i)
        {
             return (Competence)lesCompetences.get(i);
        } 
        // Permet de récupérer toutes les compétences
        public ArrayList<Competence> getLesCompetences()
        {
            return lesCompetences;
        }
        // Cette méthode permet d'ajouter une compétence à une certification
        public void ajouterCompetence(Competence uneComp)
        {
            lesCompetences.add(uneComp);
        }
        public int rechercherUneCompetence(Competence uneComp)
        {
            int trouve = 0;
            for(int i = 0 ; i < lesCompetences.size(); i ++)
            {
                if((uneComp.getNomComp().compareTo(lesCompetences.get(i).getNomComp()) == 0)        )
                {
                    trouve = i;
                    break;
                }
            }
            return trouve;
        }
}
