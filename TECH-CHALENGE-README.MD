1. Entender o negócio

Reunir com os principais envolvidos do projeto e entender o processo e suas necessidades. 
Nessa reunião envolvemos domain experts (pessoas que possuem conhecimento aprofundado sobre o domínio), analistas de negócio, gestores, stakeholders 
e todos os demais usuários que possam contribuir no entendimento do negócio.

    Objetivo

    Levantamento de Requisitos:
        Utilize a técnica do Event Storming para identificar e documentar os principais eventos e fluxos de informações do sistema. 
            Mapear as demandas, necessidades e interações dos usuários e partes interessadas envolvidas no contexto do sistema.    
                Identificar os agregados (domínios) do sistema, ou seja, as principais entidades e seus comportamentos.
    
    Arquitetura do Sistema: DONE
        Utilizar o padrão de arquitetura Domain-Driven Design (DDD) para projetar a estrutura e a organização do sistema. DONE
            Definir os principais domínios do sistema, estabelecendo os limites contextuais e as interações entre eles. DONE
                Aplicar conceitos como agregados, entidades, objetos de valor, serviços de domínio, repositórios, eventos de domínio, entre outros, para modelar a arquitetura do sistema. DONE
    
    Documentação do Projeto:
        Preparar uma documentação completa que inclua o Event Storming e a descrição da arquitetura proposta.
            Utilizar as técnicas do Event Storming para criar diagramas que representem os eventos, comandos, agregados e fluxos de informações do sistema.
                Descrever cada domínio identificado, suas responsabilidades, comportamentos e interações.
                    Documentar as decisões arquiteturais, justificando o uso de determinados conceitos e padrões do DDD.

    Implementação:
        Vocês implementarão uma versão básica do sistema utilizando a linguagem Java e as práticas do DDD. DONE
            Demonstrar a funcionalidade de pelo menos alguns fluxos principais identificados durante o levantamento de requisitos. WIP
    

    Considerações Finais
        Concluir o trabalho com uma reflexão sobre o processo de levantamento de requisitos utilizando Event Storming e a utilização da arquitetura DDD.
                    Pode parecer simples, mas é muito difícil explicar o que é um evento para pessoas não técnicas.
                    No primeiro passo, já tentar fazer o brainstorming classificando, ordenando e removendo os eventos duplicados. Se seguirmos os passos "by-the-book" perdemos muito tempo no segundo passo citado acima e as pessoas começam a perder atenção e foco na cerimônia. 
                    O facilitador ser propriamente um agilista ou ter bons skills de agilista, mas com forte conhecimento de negócio e tecnico, para ser bastante provocativo e extrair o melhor de cada pessoa que está ali na cerimônia. 
                    Domain experts, especialistas e seniores muitas vezes não tem tanto tempo de agenda disponível. Portanto o facilitador precisa extrair o melhor possivel e no menor tempo possivel de cada envolvido.
                    Fechar a linguagem ubíqua e deixar este material publicado um repositório da empresa para que todos vejam.
                    Caso a cerimonia seja feita presencialmente, não esquecer de tirar uma foto do quadro branco e posterior passar estes dados para uma ferramenta para que não se perca o que foi feito. Lembre-se que post-its descolam, rasgam ou mesmo somem. rsrs
                    Não desista se os primeiros Event Stormings não chegarem no objetivo que foi planejado inicialmente. A prática leva a perfeição, ou seja, demora um certo tempo para aprender a tocar a cerimônia de forma efetiva, com as provocações devidas e com os resultados esperados. 
        
        Destacar os benefícios esperados com a solução proposta, como melhorias na eficiência, automatização de tarefas, otimização de processos, entre outros.
                    Qual é o principal benefício da integração dessas técnicas?
                    A integração promove um sistema que é adaptável, escalável, de fácil manutenção e que reflete precisamente o domínio do negócio.
                    
                    É difícil integrar o DDD, Clean Architecture e Arquitetura Hexagonal?
                    A integração requer uma compreensão profunda de cada uma das técnicas. No entanto, o resultado é um sistema de software robusto e escalável.
                    
                    Qual é a principal característica do DDD?
                    O DDD prioriza o domínio do negócio, refletindo com precisão as necessidades e complexidades do mesmo.
                    
                    O que caracteriza a Clean Architecture?
                    A Clean Architecture é caracterizada pela separação clara das responsabilidades dos componentes do software.
                    
                    O que a Arquitetura Hexagonal oferece?
                    A Arquitetura Hexagonal oferece flexibilidade, tornando os sistemas menos suscetíveis a mudanças em tecnologias externas e facilitando a manutenção e os testes.


    Artefatos  
        Toda documentação a ser entregue deve ser em PDF, o Event Storming pode ser em ferramentas tais como Miro ou Figjam, mas estes devem ser públicos.
        Postar todo o código feito em um repositório do github, lembrando que ele deve estar público.
            