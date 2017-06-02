package ascadis.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ADMIN")
public class Administrateur extends Utilisateur{
	private static final long serialVersionUID = 1L;
	

}
