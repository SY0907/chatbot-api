# chatbot-api
ChatGPT AI 问答助手

**项目名称**：ChatGPT AI 服务化问答中心                                                                                                                                                                                               
**系统架构**：DDD 领域驱动设计，构建问答模型                                                                                                                                                                                           
**核心技术**：SpringBoot、MyBatis【项目中没有使用，你可以扩展落库了】、MySQL、XXL_JOB、Docker                                                                                                                                            
**项目描述**：此项目用于通过ChatGPT的能力，解决日常研发学习过程中的通用共性类问题信息处理，并根据所积累的提问进行资料汇总。此项目对接了知识星球提供问答服务，也提供了对接公众号和企业微信的接口，可以按需扩展。                                       
**核心职责**：                                                                                                                                                                                                                       
负责项目的整体架构设计，包括选择适合的框架和技术，设计领域模型和服务，保证系统具有高可用性、可扩展性和易维护性。                                                                                                                          
针对项目中出现的技术问题进行分析和解决，如接口爬虫时遇到的反爬机制、AI接口调用时的异常处理等，同时需要根据用户反馈及时修复bug和改进系统功能。                                                                                               
熟悉SpringBoot框架、DDD架构设计思想、Github仓库管理工具、定时任务调度工具等，掌握Docker容器部署和镜像打包的技术，能够灵活运用不同的技术手段解决实际问题。
整合 ChatGPT API 和网页问答系统，使用 Spring Boot 框架将 ChatGPT API 集成到网页问答系统中。让用户可以通过问答网页或软件向系统提问，并获得 ChatGPT 的回复。                                                                               
应用 DDD 架构进行领域隔离，通过将不同功能的代码分组到不同的领域中，实现更好的模块化和解耦，使项目易于维护和扩展。在此过程中，我学习到了 DDD 领域驱动设计的模型设计和架构分层，以及领域中聚合、实体、值对象的使用。                                
使用爬虫获取网页提问并自动回复，用于从网页上获取用户的提问。然后，将这些提问通过任务扫描的方式采集到系统，再转发到 ChatGPT，并将 ChatGPT 给出的答案自动回复给用户。同时对任务扫描的组件进行了扩展，可以支持配置，自动创建出不同的任务类型来扫描所需 的数据信息。                                                                                                                                                                                                                     
此项目使用Git维护分支版本，这样可以更好地组织各个功能模块的迭代，并使不同功能的开发过程更加独立和可控。我也掌握到了很多 Git 的操作实践能力，并且可以结合各类仓库使用。为后续与其他多人开发打下了良好的基础。                                      
最后使用 Docker 打包部署项目并进行部署。通过对 Docker 的使用，熟练的掌握了容器化环境的配置以及项目的部署和维护。                                                                                                                         
