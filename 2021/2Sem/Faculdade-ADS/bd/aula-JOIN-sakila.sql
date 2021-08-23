use sakila;
select *from inventory;
select * from film;
/*Quais filmes a nancy alugou*/
select D.title from rental A 
				inner join customer B on A.customer_id = B.customer_id
                inner join inventory C on A.inventory_id = C.inventory_id
                inner join film D on C.film_id = D.film_id
                where B.first_name like 'NANCY%';
                
/*Qual o genero do filme que a Nancy Locou ?*/
select D.title, F.name from rental A 
				inner join customer B on A.customer_id = B.customer_id
                inner join inventory C on A.inventory_id = C.inventory_id
                inner join film D on C.film_id = D.film_id
                inner join film_category E on E.film_id = D.film_id
                inner join category F on F.category_id = E.category_id
                where B.first_name like 'NANCY%';
                
/*Qual o genero do filme que a Nancy gosta mais ?*/
select F.name, count(*) from rental A 
				inner join customer B on A.customer_id = B.customer_id
                inner join inventory C on A.inventory_id = C.inventory_id
                inner join film D on C.film_id = D.film_id
                inner join film_category E on E.film_id = D.film_id
                inner join category F on F.category_id = E.category_id
                where B.first_name like 'NANCY%'
                group by F.name
                order by 2 desc;
                
/*Qual o genero mais locado*/
select F.name, count(*) from rental A 
				inner join customer B on A.customer_id = B.customer_id
                inner join inventory C on A.inventory_id = C.inventory_id
                inner join film D on C.film_id = D.film_id
                inner join film_category E on E.film_id = D.film_id
                inner join category F on F.category_id = E.category_id
                group by F.name
                order by 2 desc limit 5;
                
/*Quanto a Nancy ja gastou com locação de filmes ?*/

select B.first_name, sum(A.amount) from payment A 
					inner join customer B on A.customer_id = B.customer_id 
                    where B.first_name like 'Nancy%'
                    group by B.first_name;
                    
select * from film_category inner join film;

/*Os pagamentos registram o gerente responsavel(staff), preciso pagar 5% de comissao para cada um. 
Qual comando para me informar o valor da comissão de cada gerente */

select A.staff_id, B.first_name, sum(A.amount), format((sum(A.amount)*0.05),2) as comissao from payment A
					inner join staff B on A.staff_id = B.staff_id
                    group by A.staff_id;
                    
/*Total pago por cliente em um Mês*/

select A.customer_id, B.first_name,sum(A.amount) from payment A
			inner join customer B on A.customer_id = B.customer_id
			where date(A.payment_date) between '2005-07-01' and '2005-07-31'
			group by A.customer_id 
            order by 3 desc;
            
-- Quantos clientes a locadora tem por cidade

select C.city, count(*) as "Quantidade de clientes" from customer A 
		inner join address B on A.address_id = B.address_id
        inner join city C on B.city_id = C.city_id
        group by C.city_id
        order by 2 desc;
        

