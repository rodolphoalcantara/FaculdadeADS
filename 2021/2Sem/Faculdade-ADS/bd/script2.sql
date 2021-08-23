select p.nome as Paciente, c.data_cons as Data_Consulta, m.nome as Médico from medico m, paciente p, consulta c where m.id_med like c.fk_id_med and p.id_pac like c.fk_id_pac order by m.nome;

select count(p.id_pac) from paciente p, consulta c where p.id_pac like c.fk_id_pac and c.data_cons between '2021-03-10' and '2021-03-20';

select p.nome as Paciente, count(c.fk_id_medicamento) as Medicamento from paciente p, consulta c where p.id_pac like c.fk_id_pac group by p.id_pac;

select count(id_cons) from consulta where data_cons between '2021-03-10' and '2021-05-20';

select m.nome as Médico, (count(c.fk_id_med)*155.00) as Total from medico m, consulta c where m.id_med like c.fk_id_med and c.data_cons between '2021-03-01' and '2021-03-31' group by m.nome;

select municipio, count(id_pac) from paciente group by municipio;

update consulta set fk_id_med = 3 where id_cons like 4;

alter table medicamento add column quantidade int;
update medicamento set quantidade = 20;
update medicamento set quantidade = 0 where id_medicamento like 5;
delete from medicamento where quantidade = 0; 

alter table paciente add column celular varchar(12) after idade;

select m.especialidade, count(c.id_cons) from medico m, consulta c where c.fk_id_med like m.id_med group by m.especialidade;