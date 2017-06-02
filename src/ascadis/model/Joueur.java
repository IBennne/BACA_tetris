package ascadis.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("JOUEUR")
public class Joueur extends Utilisateur {
	private static final long serialVersionUID = 1L;

}
