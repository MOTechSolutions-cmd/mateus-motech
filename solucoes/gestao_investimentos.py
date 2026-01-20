# MOTechSolutions - Business Intelligence Division
def gerar_relatorio_investimento():
    print("="*40)
    print("      MOTechSolutions - INVEST PRO")
    print("="*40)
    
    terrenos = []
    
    while True:
        nome = input("\nIdentificação do Terreno (ou 'fim' para sair): ")
        if nome.lower() == 'fim': break
        
        largura = float(input(f"Largura de {nome} (m): "))
        comprimento = float(input(f"Comprimento de {nome} (m): "))
        v_metro = float(input("Valor do m² (R$): "))
        
        area = largura * comprimento
        preco = area * v_metro
        
        # Armazenando como um objeto de dados profissional
        terrenos.append({
            "nome": nome,
            "area": area,
            "preco": preco
        })

    # Exibição de Relatório Final Elaborado
    print("\n\n" + " " * 10 + "RELATÓRIO DE VIABILIDADE")
    print("-" * 45)
    print(f"{'TERRENO':<20} | {'ÁREA':<10} | {'PREÇO TOTAL'}")
    print("-" * 45)
    
    total_investimento = 0
    for t in terrenos:
        print(f"{t['nome']:<20} | {t['area']:>7.2f} m² | R$ {t['preco']:>10.2f}")
        total_investimento += t['preco']
    
    print("-" * 45)
    print(f"VALOR TOTAL DO PORTFÓLIO: R$ {total_investimento:.2f}")
    print("=" * 45)
    print("Gerado por MOTechSolutions Business Solutions")

if __name__ == "__main__":
    gerar_relatorio_investimento()
