/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IServices;

import Entities.Commentaire;
import java.util.List;

/**
 *
 * @author Maha
 */
public interface ICommentaire
{
    public void ajouterCommentaire(Commentaire c);
    public void supprimerCommentaire(Commentaire c);
    public void modifierCommentaire(Commentaire c);
    public List<Commentaire>afficherCommentaires();
    public List<Commentaire> chercherCommentaireParNom(String nomUti);
}
