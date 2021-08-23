-- FUNCOES

/*crie uma função para listar os pagamentos realizados com o valor da comissão de 5%*/

select * from payment;

DELIMITER $$
create function comissao_cincop (id_pag int)
	returns decimal(9,2) 
    deterministic
    begin
    declare comissao_cp decimal(5,2);
    select amount*0.05 into comissao_cp from payment where payment_id = id_pag;
    return comissao_cp;
    end $$
    
    select comissao_cincop(1);
    select *, comissao_cincop(payment_id) as comissao from payment;
    
    
    /*Crie uma função para listar os pagamentos com a comissao do gerente, sendo 5% para gerente 1 e 3% para o gerente 2*/
    
	DELIMITER $$
    create function comissao_gerentes (id_pag int)
		returns decimal(9,2) 
        deterministic 
        begin
		declare comis decimal(9,2);
		declare valor decimal(9,2);
        declare gerente int;
        select staff_id, amount into gerente,valor from payment where payment_id = id_pag;
        if gerente = 1 then set comis = valor * 0.05;
        else set comis = valor * 0.03;
        end if;
        return comis;
        end $$



/*		Crie uma função para listar os pagamentos com a comissao do gerente, sendo 5% para gerente 1 e 3% para o gerente 2
O resultado deve sair: NOME_DO_GERENTE = XXX,XX		*/

DELIMITER $$
    create function comissao_nomes_gerentes (id_pag int)
		returns decimal(9,2) 
        deterministic 
        begin
		declare comis decimal(9,2);
		declare valor decimal(9,2);
        declare gerente int;
        declare nomeger varchar(50);
        select A.staff_id, A.amount, B.first_name into gerente,valor,nomeger from payment A inner join staff B on A.staff_id = B.staff_id where payment_id = id_pag;
        if gerente = 1 then set comis = valor * 0.05;
        else set comis = valor * 0.03;
        end if;
        return concat(nomeger,' = ', comis);
        end $$



    
    
    