
const taskInput = document.getElementById("taskInput");
const categorySelect = document.getElementById("category");
const addBtn = document.getElementById("addBtn");
const taskContainer = document.getElementById("taskContainer");

const totalTasks = document.getElementById("totalTasks");
const completedTasks = document.getElementById("completedTasks");
const pendingTasks = document.getElementById("pendingTasks");
const taskCount = document.getElementById("taskCount");

let tasks = JSON.parse(localStorage.getItem("tasks")) || [];

// ---------- Save Tasks ----------
function saveTasks() {
    localStorage.setItem("tasks", JSON.stringify(tasks));
}

// ---------- Format Date ----------
function getCurrentDate() {
    const options = {
        day: "2-digit",
        month: "short",
        year: "numeric",
        hour: "2-digit",
        minute: "2-digit"
    };

    return new Date().toLocaleString("en-IN", options);
}

// ---------- Update Statistics ----------
function updateStats() {

    totalTasks.textContent = tasks.length;

    const completed = tasks.filter(task => task.completed).length;

    completedTasks.textContent = completed;

    pendingTasks.textContent = tasks.length - completed;

    taskCount.textContent = `${tasks.length} Task${tasks.length !== 1 ? "s" : ""}`;
}

// ---------- Render Tasks ----------
function renderTasks() {

    taskContainer.innerHTML = "";

    if(tasks.length === 0){

        taskContainer.innerHTML = `
            <div class="empty">
                <i class="fa-solid fa-clipboard-list"></i>
                <h2>No Tasks Yet</h2>
                <p>Add your first task above.</p>
            </div>
        `;

        updateStats();
        return;
    }

    tasks.forEach((task,index)=>{

        const card=document.createElement("div");

        card.className=`task-card ${task.completed ? "completed-task":""}`;

        card.innerHTML=`

        <div class="card-top">

            <span class="category">${task.category}</span>

            <span class="state">
                ${task.completed ? "✔ Completed" : "● Pending"}
            </span>

        </div>

        <div class="task-text">
            ${task.text}
        </div>

        <div class="time">
            Created : ${task.created}
        </div>

        <div class="actions">

            <button class="complete-btn" onclick="toggleTask(${index})">

                ${
                    task.completed
                    ? '<i class="fa-solid fa-rotate-left"></i> Undo'
                    : '<i class="fa-solid fa-check"></i> Complete'
                }

            </button>

            <button class="delete-btn" onclick="deleteTask(${index})">

                <i class="fa-solid fa-trash"></i> Delete

            </button>

        </div>

        `;

        taskContainer.appendChild(card);

    });

    updateStats();
    saveTasks();

}

// ---------- Add Task ----------
function addTask(){

    const text = taskInput.value.trim();

    if(text===""){

        alert("Please enter a task.");

        return;
    }

    tasks.unshift({

        text:text,

        category:categorySelect.value,

        completed:false,

        created:getCurrentDate()

    });

    taskInput.value="";

    renderTasks();

}

// ---------- Complete ----------
function toggleTask(index){

    tasks[index].completed=!tasks[index].completed;

    renderTasks();

}

// ---------- Delete ----------
function deleteTask(index){

    if(confirm("Delete this task?")){

        tasks.splice(index,1);

        renderTasks();

    }

}

// ---------- Events ----------
addBtn.addEventListener("click",addTask);

taskInput.addEventListener("keypress",function(e){

    if(e.key==="Enter"){

        addTask();

    }

});

// ---------- Initial ----------
renderTasks();