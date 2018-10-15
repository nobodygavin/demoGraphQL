# demoGraphQL
2018 Hackathon GraphQL

**_graphql-spring-boot-starter_**
  to turn your boot application into GraphQL server
  
**_graphiql-spring-boot-starter_**
  to embed GraphiQL tool for schema introspection and query debugging


 
query AllBooks {
  books {
    id
    name
    author {
      id
      name
    }
  }
}


query AllAuthors {
  authors {
    id
    name
    books {
      id
      name
      reviews {
        id
        comment
      }  
    }    
  }
}



query Author($authorId: Int!) {
  author(id: $authorId) {
    id
    name
    books {
      id
      name
      reviews {
        id
        comment
      }
    }
  }
}
{"authorId": 1}
