package com.cloudeducationbrazil.dsvenda.entities;

import java.time.LocalDate;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name= "tb_sales")
public class Sale {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	private String sellerName; // Nome do vendedor
	private Integer visited;
	private Integer deals; // Quantidade de Vendas Realizadas
	private Double amount; // valor total das vendas (montante)
	private LocalDate date;

	public Sale() {} // Função para criar/instanciar objetos (constructor)

	// Função para criar/instanciar objetos (constructor)
	public Sale(Long id, String sellerName, Integer visited, Integer deals, Double amount, LocalDate date) {
		Id = id;
		this.sellerName = sellerName;
		this.visited = visited;
		this.deals = deals;
		this.amount = amount;
		this.date = date;
	}


	// Métodos de acesso para os objetos (ENCAPSULAMENTO)
	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public Integer getVisited() {
		return visited;
	}

	public void setVisited(Integer visited) {
		this.visited = visited;
	}

	public Integer getDeals() {
		return deals;
	}

	public void setDeals(Integer deals) {
		this.deals = deals;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Sale [Id=" + Id + ", sellerName=" + sellerName + ", visited=" + visited + ", deals=" + deals
				+ ", amount=" + amount + ", date=" + date + "]";
	};
}

