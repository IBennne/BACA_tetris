/**
 * Fonction js permettant de sélectionner un bloc du tetrimino Envoie de la
 * réponse au formulaire d'editTetrimino.jsp^
 * 
 * auteur ARE
 */

// Création d'un conteneur de cellule
var c = [ [], [], [], [] ];

for (var i = 0; i < 4; i++) {
	for (var j = 0; j < 4; j++) {
		var id = (i) + "," + (j);
		c[i][j] = new Cell(id);
	}
}

// Création du classe de cellule
function Cell(id) {

	// création des champs de la classe Cell
	this.id = id;
	this.elem = document.getElementById(id);
	this.selected = false;
	this.selectable = true;

	// ajout d'eventListener à chaque cellule
	this.elem.addEventListener('mouseover', overChange);
	this.elem.addEventListener('mouseout', outChange);
	this.elem.addEventListener('click', change);
};

// Fonction permettant de changer la couleur des cellules selectionnable lors de
// l'événement 'mouseover'
function overChange() {

	var id = this.id.split(",")
	var cell = c[id[0]][id[1]];

	if (cell.selectable && !cell.selected) {
		this.style.backgroundColor = "#ee6e73" /* #DC193A" */;
	}
}

// l'événement 'mouseover'
function outChange() {

	var id = this.id.split(",")
	var cell = c[id[0]][id[1]];

	if (cell.selectable && !cell.selected) {
		this.style.backgroundColor = "#00e1e1";
	}
}

function change() {

	var id = this.id.split(",")
	var cell = c[id[0]][id[1]];

	if (cell.selectable) {
		if (!cell.selected){
			this.style.backgroundColor = "#e8333d";
		} else {
			this.style.backgroundColor = "#00e1e1";
		}
		
		cell.selected = !cell.selected;
	}
	
	decideSelectable();
}
