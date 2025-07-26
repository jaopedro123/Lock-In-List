package com.Brio.Segunda;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "segundaFeira")
public class Segunda {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(length = 128, nullable = false, unique = true)
	private String Afazer_Titulo;
	
	@Column(length = 64, nullable = false)
	private String Afazer_Desc;
	
	@Column(length = 64)
	private String Fotos_Desc;
	
	private boolean Concluido;
	
	
		public Segunda() {
			
		}
	
	public Segunda(Integer id, String afazer_Titulo, String afazer_Desc, String fotos_Desc, boolean concluido) {
			super();
			this.id = id;
			Afazer_Titulo = afazer_Titulo;
			Afazer_Desc = afazer_Desc;
			Fotos_Desc = fotos_Desc;
			Concluido = concluido;
		}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAfazer_Titulo() {
		return Afazer_Titulo;
	}

	public void setAfazer_Titulo(String afazer_Titulo) {
		Afazer_Titulo = afazer_Titulo;
	}

	public String getAfazer_Desc() {
		return Afazer_Desc;
	}

	public void setAfazer_Desc(String afazer_Desc) {
		Afazer_Desc = afazer_Desc;
	}

	public String getFotos_Desc() {
		return Fotos_Desc;
	}

	public void setFotos_Desc(String fotos_Desc) {
		Fotos_Desc = fotos_Desc;
	}

	public boolean isConcluido() {
		return Concluido;
	}

	public void setConcluido(boolean concluido) {
		Concluido = concluido;
	}

	@Override
	public String toString() {
		return "Segunda [id=" + id + ", Afazer_Titulo=" + Afazer_Titulo + ", Afazer_Desc=" + Afazer_Desc
				+ ", Fotos_Desc=" + Fotos_Desc + ", Concluido=" + Concluido + "]";
	}
	
}
