import React, { Component } from 'react'
import { QuizData } from './QuizData'
import './styles.css'

export class Quiz extends Component {
 
    constructor(props){
        super(props)

        this.state = {
            userAnswer: null,
            currentIndex: 0,
            options: [],
            questions:[],
            quizEnd: false,
            score: 0,
            disabled: true,
            s: []
        }
    }

    loadQuiz = () =>{

        const {currentIndex} = this.state;
        this.setState(() => {  
            return{
                questions: QuizData[currentIndex].questions,
                options: QuizData[currentIndex].options,
                answer: QuizData[currentIndex].answer
            }
          })

    }

    nextQuestionHander = () => {
        const {userAnswer, answer, score} = this.state
        this.setState({
            currentIndex: this.state.currentIndex + 1,
            userAnswer: null,
            disabled: true
        })
        //Check if correct answer and increment score
        if(userAnswer === answer){
            this.setState({
                score: score + 1
            })
        }
        
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
                    questions: QuizData[currentIndex].questions,
                    options: QuizData[currentIndex].options,
                    answer: QuizData[currentIndex].answer
                }
              });
        }
    }

    finishHandler =() => {
        const {userAnswer, answer, score} = this.state

         //Check if correct answer and increment score
         if(userAnswer === answer){
            this.setState({
                score: score + 1
            });}

        if(this.state.currentIndex === QuizData.length -1){
            this.setState({
                userAnswer: null,
                quizEnd:true
            })
        }
        
    }

    render() {
        const {
            questions, options, currentIndex, userAnswer, quizEnd} = this.state //get the current state
        
        
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
        }
                
        return (
            <div className='container'>
                
                <span>{`Question ${currentIndex+1} of ${QuizData.length}`}</span>

                <h2>{questions}</h2>

                {options.map(option => (  //for each option, new paragraph
                    <p key={option.id} 
                    className={`ui floating message options
                    ${userAnswer === option ? "selected" : null}
                    `}
                    onClick= {() => this.checkAnswer(option),s.push(userAnswer)}
    
                    >
                        {option}
                    </p>
                   
                ))}

                {currentIndex < QuizData.length -1 &&
                <button 
                className="ui inverted button"
                disabled = {this.state.disabled}
                onClick = {this.nextQuestionHander}
                    >Next Question</button>
                }

                {currentIndex === QuizData.length -1 &&
                <button
                className="ui inverted button"
                disabled = {this.state.disabled}
                onClick = {this.finishHandler}
                >Finish</button>
                }

            </div>
        )
    }
}

export default Quiz
