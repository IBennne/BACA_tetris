<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<form method="post">
	<input type="hidden" name="tetrimino_id" value="${ tetrimino.id }" />

	<div class="input-field">
		<input id="tetrimino_nom" type="text" class="validate"
			name="tetrimino_nom" value="${ tetrimino.nom }" /> <label
			for="tetrimino_nom">Nom</label>
	</div>

	<div class="input-field">
		<input id="tetrimino_couleur" type="text" class="validate"
			name="tetrimino_couleur" value="${ tetrimino.couleur }" /> <label
			for="tetrimino_couleur">Couleur</label>
	</div>

	<c:forEach items = "${ tetrimino.formes }" var = "forme" >

		<div class="tableEditTetrimino">
			<table>
				<c:forEach var="i" begin="0" end="3" step="1">
					<tr>
						<c:forEach var="j" begin="0" end="3" step="1">
							
							<c:set var = "block" value = "${forme.exist(i,j) }" />
							
							<c:if test="${ block != null }" >
							<a href="deleteBlock?id_Block=${block.id}&x=${i}&y=${j}" />
							<td id="${i},${j}" bgcolor = "red" ></td>
							</c:if>
							
							<c:if test="${ block == null }" >
							<a href="editBlock?id_Forme=${forme.id}&x=${i}&y=${j}" />
							<td id="${i},${j}"	></td>
							</c:if>
							
							
						</c:forEach>
					</tr>
				</c:forEach>
			</table>
		</div>
		
	</c:forEach>

	<div class="fixed-action-btn">
		<a href="editForm" class="btn-floating btn-large red"> <i
			class="large material-icons">add</i>
		</a>
	</div>

	<button class="btn waves-effect waves-light" type="submit">
		Valider <i class="material-icons right">send</i>
	</button>
</form>