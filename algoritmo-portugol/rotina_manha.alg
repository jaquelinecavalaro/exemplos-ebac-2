algoritmo "rotina_manha"

inicio
    // Celular alarma na hora programada
    alarme := 7:00
    
    // Colocar em soneca
    escolha_soneca := verdadeiro
    
    // Verifica se o alarme foi colocado em soneca
    se escolha_soneca entao
        // Acordar após 10 minutos com o novo toque do despertador
        alarme := alarme + 10 minutos
        abrir_olhos()
        parar_alarme()
        levantar_da_cama()
        andar_ate_cozinha()
        fazer_cafe()
        comer()
        escovar_dentes()
        pentear_cabelo()
        ir_escritorio()
        ligar_notebook()
        entrar_atrasada()
    senao
        // Se acordar no horário
        abrir_olhos()
        parar_alarme()
        levantar_da_cama()
        andar_ate_cozinha()
        fazer_cafe()
        comer()
        escovar_dentes()
        pentear_cabelo()
        ir_escritorio()
        ligar_notebook()
        entrar_no_horario()
    fimse
fimalgoritmo
