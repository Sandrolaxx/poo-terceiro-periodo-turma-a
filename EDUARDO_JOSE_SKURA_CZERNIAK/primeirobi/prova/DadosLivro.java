// package EDUARDO_JOSE_SKURA_CZERNIAK.primeirobi.prova;

// public class DadosLivro {
    
//     private String tituloLivro;
//     private String autorLivro;
//     private String disponibilidadeLivro;

//     String numeroEmprestimo;
//     String empNome;
//     String empId;
//     String empCurso;

//     Long diaDate = 86400000l;
//     Date horarioAgora = new Date();
//     Long seteDias = diaDate * 7;


//     public DadosLivro(String tituloLivro, String autorLivro, String disponibilidadeLivro, String numeroEmprestimo,
//             String empNome, String empId, String empCurso, Long diaDate, Date horarioAgora, Long seteDias) {
//         this.tituloLivro = tituloLivro;
//         this.autorLivro = autorLivro;
//         this.disponibilidadeLivro = disponibilidadeLivro;
//         this.numeroEmprestimo = numeroEmprestimo;
//         this.empNome = empNome;
//         this.empId = empId;
//         this.empCurso = empCurso;
//         this.diaDate = diaDate;
//         this.horarioAgora = horarioAgora;
//         this.seteDias = seteDias;
//     }

//     public void apresentarLivro() {
//         System.out.println("A obra " + tituloLivro + " tem como autoria por " + autorLivro);
//     }

    
//     public String getTituloLivro() {
//         return tituloLivro;
//     }

//     public void setTituloLivro(String tituloLivro) {
//         this.tituloLivro = tituloLivro;
//     }

//     public String getAutorLivro() {
//         return autorLivro;
//     }

//     public void setAutorLivro(String autorLivro) {
//         this.autorLivro = autorLivro;
//     }

//     public String getDisponibilidadeLivro() {
//         return disponibilidadeLivro;
//     }

//     public void setDisponibilidadeLivro(String disponibilidadeLivro) {
//         this.disponibilidadeLivro = disponibilidadeLivro;
//     }

//     public String getNumeroEmprestimo() {
//         return numeroEmprestimo;
//     }

//     public void setNumeroEmprestimo(String numeroEmprestimo) {
//         this.numeroEmprestimo = numeroEmprestimo;
//     }

//     public String getEmpNome() {
//         return empNome;
//     }

//     public void setEmpNome(String empNome) {
//         this.empNome = empNome;
//     }

//     public String getEmpId() {
//         return empId;
//     }

//     public void setEmpId(String empId) {
//         this.empId = empId;
//     }

//     public String getEmpCurso() {
//         return empCurso;
//     }

//     public void setEmpCurso(String empCurso) {
//         this.empCurso = empCurso;
//     }

//     public Long getDiaDate() {
//         return diaDate;
//     }

//     public void setDiaDate(Long diaDate) {
//         this.diaDate = diaDate;
//     }

//     public Date getHorarioAgora() {
//         return horarioAgora;
//     }

//     public void setHorarioAgora(Date horarioAgora) {
//         this.horarioAgora = horarioAgora;
//     }

//     public Long getSeteDias() {
//         return seteDias;
//     }

//     public void setSeteDias(Long seteDias) {
//         this.seteDias = seteDias;
//     }

//     public void processoDisponibilidade(){
//         if (disponibilidadeLivro.equals("true")) {
//                 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//                 System.out.println("\nHá 1 item disponível!\n");
//                 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//                 System.out.println("\nRealizando Empréstimo...\n");
//                 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
//                 Emprestimo empUm = new Emprestimo(tituloLivro, autorLivro, disponibilidadeLivro, autorLivro, tituloLivro, disponibilidadeLivro, autorLivro, null, null, null);
        
//                 empUm.setNumeroEmprestimo("001");
//                 empUm.setEmpNome("Eduardo");
//                 empUm.setEmpId("123456789");
//                 empUm.setHorarioAgora(new Date());
//                 empUm.setEmpCurso("Engenharia de Software");
//                 empUm.processoEmprestimo();
//                 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//             } else {
//                 System.out.println("Não há nenhum item disponível");
//                 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//             }
//         }
//     }
