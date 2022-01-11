import React, { Component } from 'react'
import { QuizData } from './QuizData'
import './styles.css'

function Answer(props){
   const quizEnd = this.state
   if(quizEnd) {
    return (
        <div className='container'>
            <h1>Game Over. Final score is {this.state.score} points</h1>
            <p>The correct Answers for the quiz are</p>
            <ul>
                {QuizData.map((item, index) => (
                    <li className='ui floating message options'
                        key={index}>
                            {item.answer}
                    </li>
                ))}
            </ul>
        </div>
    )
}}

export class Quizes extends Component {
 
    constructor(props){
        super(props)

        this.state = {
            userAnswer: null,
            currentIndex: 0,
            options: [],
            questions: [],
            quizEnd: false,
            score: 0,
            disabled: true
        }
    }

    loadQuiz = () =>{

        const {currentIndex} = this.state;
        this.setState(() => {  
            return{
                question: QuizData[currentIndex].question,
                options: QuizData[currentIndex].options,
                answer: QuizData[currentIndex].answer
            }
          })

    }

    componentDidMount(){ this.loadQuiz(); }

    //Check the answer
    checkAnswer = answer => {
        this.setState({
            userAnswer: answer,
            disabled:false
    })
    }

    componentDidUpdate(prevProps, prevState){
        const{currentIndex} = this.state;
        if(this.state.currentIndex != prevState.currentIndex){
            this.setState(() => {  
                return{
                    question: QuizData[currentIndex].question,
                    options: QuizData[currentIndex].options,
                    answer: QuizData[currentIndex].answer
                }
              });
        }
    }

    finishHandler =() => {   
       
            this.setState({
                userAnswer: null,
                quizEnd:true
            })
        
        
    }

    render() {
        const {
          userAnswer, quizEnd} = this.state //get the current state
        
        
        
                
        return (
            <div className='containers'>
                
                <span><h3>Quiz Questions</h3></span>

                    <ul>
                        {QuizData.map((item) => (
                          <>  <li className='ui floating message container2'
                                key={item.id}>
                                <h3> {item.questions}  </h3>                                                 
                                <p className={`ui floating message options  ${userAnswer === item.options[0] ? "selected" : null} `}  onClick= {() => this.checkAnswer(item.options[0])}>A. {item.options[0]} </p>
                                <p className={`ui floating message options  ${userAnswer === item.options[1] ? "selected" : null} `}  onClick= {() => this.checkAnswer(item.options[1])}>B. {item.options[1]} </p>                           
                                <p className={`ui floating message options ${userAnswer === item.options[2] ? "selected" : null} `}  onClick= {() => this.checkAnswer(item.options[2])} >C. {item.options[2]} </p>
                                <p className={`ui floating message options ${userAnswer === item.options[3] ? "selected" : null} `}  onClick= {() => this.checkAnswer(item.options[3])} >D. {item.options[3]} </p>
                                
                            </li>
                            
                            <div></div></>))}
                        
                    </ul>

                      

            
               

               { 
                <button
                className="ui inverted button"
                disabled = {this.state.disabled}
                onClick = {this.finishHandler}
                >Submit</button>
                }

            </div>
        )
    }
}

export default Quizes
