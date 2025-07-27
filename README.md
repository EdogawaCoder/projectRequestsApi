Request Management System
リクエスト管理システム
Sistema de Gerenciamento de Solicitações

This project aims to develop a system for registering and managing service requests. It is being built with a fullstack architecture in mind and includes multilingual support for global-ready applications.
このプロジェクトは、サービスリクエストの登録と管理を目的としたシステムの開発を目指しています。将来的なフルスタック化と多言語対応を視野に入れた設計です。
Este projeto tem como objetivo criar um sistema para registro e gerenciamento de solicitações. Está sendo desenvolvido com foco em aplicações fullstack e suporte multilíngue para cenários globais.
______________________________________________________________________________________________________________________________________________________________________________________________________________________________________________

Features
主な機能
Funcionalidades

Register new service requests

List requests by status

Automatically capture date and customer data

Ready for future frontend integration

サービスリクエストの新規登録

ステータス別のリクエスト一覧表示

日付と顧客データの自動取得

将来のフロントエンド統合に対応

Cadastro de solicitações

Listagem por status

Registro automático de data e cliente

Pronto para integração com frontend

______________________________________________________________________________________________________________________________________________________________________________________________________________________________________________

Tech Stack
使用技術
Tecnologias utilizadas

Java 21

Spring Boot

PostgreSQL

Swagger for API documentation

Docker 

APIドキュメントのためのSwagger

将来のDocker

Swagger para documentação da API

Docker 
______________________________________________________________________________________________________________________________________________________________________________________________________________________________________________

Getting Started
始め方
Como executar o projeto

Clone the repository
git clone https://github.com/EdogawaCoder/projectRequestsApi

Create a PostgreSQL database named requests_db

Set your DB credentials in application.properties

Build and run on terminal:
./mvnw clean install
./mvnw spring-boot:run
- docker-compose up -d 

______________________________________________________________________________________________________________________________________________________________________________________________________________________________________________


Project Structure
プロジェクト構成
Estrutura do projeto

src/
├── controllers

├── dtos

├── entities

├── repositories

├── services

└── main

______________________________________________________________________________________________________________________________________________________________________________________________________________________________________________


Roadmap
今後の予定
Próximos passos

Frontend implementation on Angular

Docker integration

Front-end

Admin dashboard

フロントエンドの実装 (Angularで作ります)

管理用ダッシュボードの追加

Implementação do frontend (Angular)

Painel administrativo

