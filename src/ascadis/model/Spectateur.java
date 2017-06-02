package ascadis.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue("SPECTATEUR")
public class Spectateur extends Utilisateur{
	private static final long serialVersionUID = 1L;

}
