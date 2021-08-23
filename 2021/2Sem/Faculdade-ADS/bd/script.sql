create database Hospital;
use Hospital;

create table recepcionista (
	id_recep int not null auto_increment,
    nome varchar(60) not null,
    idade int not null,
    cpf varchar(11) not null unique,
    
    primary key (id_recep)
);

create table paciente (
	id_pac int not null auto_increment,
    nome varchar(60) not null,
    idade int not null,
    municipio varchar(40),
    doenca varchar(20),
    cpf varchar(11) not null unique,
    fk_id_recep int not null,
    
    primary key (id_pac),
    foreign key (fk_id_recep) references recepcionista(id_recep)
);

create table medico (
	id_med int not null auto_increment,
    nome varchar(60) not null,
    idade int not null,
    municipio varchar(40),
    especialidade varchar(30),
    cpf varchar(11) not null unique,
    
    primary key (id_med)
);

create table medicamento (
	id_medicamento int not null auto_increment,
    nome_medicamento varchar(20),
    
    primary key (id_medicamento)
);

create table consulta (
	fk_id_med int not null,
    fk_id_pac int not null,
    fk_id_medicamento int not null,
    id_cons int not null auto_increment,
    hora_cons time,
    data_cons date,
    
    primary key (id_cons),
    foreign key (fk_id_med) references medico(id_med),
    foreign key (fk_id_pac) references paciente(id_pac),
    foreign key (fk_id_medicamento) references medicamento(id_medicamento)
);

insert into recepcionista(nome, idade, cpf) values
			('Maria', 25, '11122233344'),
            ('João', 24,'12312312312'),
            ('Roberta', 35, '12121212121'),
            ('Gerusa', 44, '11111111111'),
            ('Geronimo',50, '21321513321');

insert into paciente(nome, idade, municipio, doenca, cpf, fk_id_recep) values
			('Maristela', 25, 'Diadema', 'diabete', '12315498725', 3),
            ('Giovanna', 21, 'São Paulo', 'zika virus', '75982654785', 5),
            ('João', 33, 'São Paulo', 'coronavirus', '64556874289', 2),
            ('Agatha', 58, 'São Bernardo do Campo', 'diabete', '56568584689', 3),
            ('Samantha', 37, 'Santo André', 'Doença de Crohn', '65988685421', 1);

insert into medico(nome, idade, municipio, especialidade, cpf) values
			('José', 44, 'São Paulo', 'endocrinologista', '54686684287' ),
            ('Gregório', 62, 'São Paulo', 'virologista', '56858985222'),
            ('Fernanda', 29, 'Diadema', 'clinico geral', '66868522358'),
            ('Sebastião', 38, 'Santo André', 'gastroenterologista', '89558548484'),
            ('Marlene', 55, 'São Caetano', 'clinico geral', '63532522578');
            
insert into medicamento(nome_medicamento) values
			('Insulina'),
            ('Ciclosporina'),
            ('Azitromicina'),
            ('Dipirona'),
            ('Ibuprofeno');
            
insert into consulta(fk_id_med, fk_id_pac, fk_id_medicamento, data_cons, hora_cons) values
			(1,1,1,'2021-04-10', '12:00:00'),
            (2,2,4,'2021-03-23', '08:00:00'),
            (2,3,3,'2021-03-12', '09:00:00'),
            (1,4,1,'2021-04-10', '11:00:00'),
            (4,5,2,'2021-03-15', '14:00:00');