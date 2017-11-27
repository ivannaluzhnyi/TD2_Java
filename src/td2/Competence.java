/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package td2;

public class Competence
{
    // Membres privés
        private String nomComp;
        private boolean valide;
        // Constructeur paramétré
        public Competence(String unNom, boolean estValide)
        {
            nomComp = unNom;
            valide = estValide;
        }
        // Permet de récupérer le nom de la compétence
        public String getNomComp()
        {
            return nomComp;
        }
        // Permet de récupérer le booléen valide
        // Pour savoir si la compétence a été validée
        public boolean  getValide()
        {
            return valide;
        }
        // Permet de modifier le booléen "valide" de la compétence
        public void setValide(boolean unBool)
        {
            valide = unBool;
        }
}
