# AgendaDeEventos
### Modelagem de dados:

![diagrama-de-classes](https://github.com/viccttor/PeopleManegemant/blob/main/resources/diagrama-de-classes.png)

### Tabelas
1. Tabela "Usuários":
    - ID: identificador único do usuário (chave primária)
    - Nome: nome do usuário
    - Email: endereço de e-mail do usuário
    - Telefone: número de telefone do usuário
    - CPF: número de CPF do usuário
   - Endereco_ID: Endereço do usuário (estado, cidade, rua, número, ponto de referência)

2. Tabela "Bandas":
    - ID: identificador único da banda (chave primária)
    - Nome: nome da banda
    - Descrição: descrição da banda, gênero musical, etc.

3. Tabela "Agenda":
    - ID: identificador único do evento na agenda (chave primária)
    - BandaID: ID da banda (chave estrangeira referenciando a tabela de bandas)
    - Data: data do evento agendado
    - Horário de início: horário de início do evento agendado
    - Horário de término: horário de término do evento agendado

4. Tabela "Eventos":
    - ID: identificador único do evento contratado (chave primária)
    - BandaID: ID da banda contratada (chave estrangeira referenciando a tabela de bandas)
    - Data: data do evento contratado
    - Horário de início: horário de início do evento contratado
    - Horário de término: horário de término do evento contratado
    - Endereco_ID: Endereço do local do evento (estado, cidade, rua, número, ponto de referência)

5. Tabela Endereco
    - ID: identificador único do evento contratado (chave primária)
    - Estado: estado do usuario/evento
    - Cidade: cidade do usuario/evento
    - Rua: rua do usuario/evento
    - Número: numero do usuario/evento
    - Ponto de referência: ponto de referência do usuario/evento

### Funcionamento

- Quando Luiz se cadastra na plataforma, seus dados são armazenados na tabela "Usuários" e 
seu endereço na tabela "Endereco".
- As bandas cadastradas na plataforma são armazenadas na tabela "Bandas".
- Quando uma banda adiciona um evento em sua agenda, um registro é inserido na tabela "Agenda" com o ID da banda, a data e os horários do evento.
- Quando Luiz busca por uma data disponível, o sistema verifica na tabela "Agenda" quais bandas estão disponíveis nessa data e horário.
- Ao escolher a banda e a data do evento, Luiz pode fazer a contratação. Os detalhes do evento são então armazenados na tabela "Eventos" e
  o endereço  do evento na tabela "Endereco".







